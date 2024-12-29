package com.miot.common.device.parser.xml;

import com.miot.common.device.Action;
import com.miot.common.device.Argument;
import com.miot.common.device.Device;
import com.miot.common.device.Service;
import com.miot.common.device.parser.DeviceParser;
import com.miot.common.device.urn.UrnType;
import com.miot.common.device.urn.UrnTypeParser;
import com.miot.common.exception.device.InvalidActionException;
import com.miot.common.exception.device.InvalidArgumentException;
import com.miot.common.exception.device.InvalidDeviceException;
import com.miot.common.exception.device.InvalidPropertyException;
import com.miot.common.exception.device.InvalidServiceException;
import com.miot.common.property.AllowedValueAny;
import com.miot.common.property.AllowedValueList;
import com.miot.common.property.AllowedValueRange;
import com.miot.common.property.DataType;
import com.miot.common.property.Property;
import com.miot.common.property.PropertyDefinition;
import java.io.InputStream;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlDeviceParser implements DeviceParser {
    public static final String TAG = "XmlDeviceParser";

    public static Action parseAction(Service service, Element element) {
        Action action = new Action();
        action.setDescription(XmlExt.getValue(element, "description"));
        action.setServiceType(service.getType().toString());
        String value = XmlExt.getValue(element, "friendlyName");
        if (value != null) {
            action.setFriendlyName(value);
            String value2 = XmlExt.getValue(element, "internalName");
            if (value2 != null) {
                action.setInternalName(value2);
                Element child = XmlExt.getChild(element, DddTag.ARGS);
                if (child != null) {
                    NodeList elementsByTagName = child.getElementsByTagName(DddTag.ARGS_ARG);
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        action.addArgument(parseArgument(service, (Element) elementsByTagName.item(i)));
                    }
                }
                return action;
            }
            throw new InvalidActionException("internalName is null");
        }
        throw new InvalidActionException("friendlyName is null");
    }

    public static void parseActions(Service service, Element element) {
        Element child = XmlExt.getChild(element, DddTag.ACTIONS);
        if (child != null) {
            NodeList elementsByTagName = child.getElementsByTagName(DddTag.ACTION);
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                service.addAction(parseAction(service, (Element) elementsByTagName.item(i)));
            }
            return;
        }
        throw new InvalidActionException("parse actions failed, actionList is null");
    }

    public static AllowedValueList parseAllowedValueList(DataType dataType, Element element) {
        AllowedValueList allowedValueList = new AllowedValueList(dataType);
        NodeList elementsByTagName = element.getElementsByTagName(DddTag.PL_PROPERTY_ALLOWEDVALUELIST_VALUE);
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            allowedValueList.appendAllowedValue(dataType.toObjectValue(((Element) elementsByTagName.item(i)).getTextContent()));
        }
        return allowedValueList;
    }

    public static AllowedValueRange parseAllowedValueRange(DataType dataType, Element element) {
        String value = XmlExt.getValue(element, DddTag.PL_PROPERTY_ALLOWEDVALURANGE_MIN);
        if (value != null) {
            String value2 = XmlExt.getValue(element, DddTag.PL_PROPERTY_ALLOWEDVALURANGE_MAX);
            if (value2 != null) {
                return new AllowedValueRange(dataType, dataType.toObjectValue(value), dataType.toObjectValue(value2));
            }
            throw new InvalidPropertyException("max value is null");
        }
        throw new InvalidPropertyException("min value is null");
    }

    public static Argument parseArgument(Service service, Element element) {
        Argument argument = new Argument();
        String value = XmlExt.getValue(element, DddTag.ARGS_ARG_DIRECTION);
        argument.setDirection(value != null ? Argument.Direction.valueOf(value) : Argument.Direction.in);
        String value2 = XmlExt.getValue(element, "name");
        if (value2 != null) {
            argument.setName(value2);
            String value3 = XmlExt.getValue(element, DddTag.ARGS_ARG_RELATEDPROPERTY);
            if (value3 != null) {
                Property property = null;
                Iterator<Property> it = service.getProperties().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Property next = it.next();
                    if (next.getDefinition().getName().equals(value3)) {
                        property = next;
                        break;
                    }
                }
                if (property != null) {
                    argument.setRelatedProperty(property);
                    return argument;
                }
                throw new InvalidArgumentException("cannot find relatedProperty, " + value3);
            }
            throw new InvalidArgumentException("relatedProperty is null");
        }
        throw new InvalidArgumentException("name is null");
    }

    public static void parseConfigs(Service service, Element element) {
        String value;
        Element child = XmlExt.getChild(element, DddTag.CONFIGS);
        if (child != null && (value = XmlExt.getValue(child, "getProperty")) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("getProp: ");
            sb.append(value);
            service.addConfig("getProperty", value);
        }
    }

    public static void parseDevice(Device device, Element element) {
        Element child = XmlExt.getChild(element, DddTag.DEVICE);
        if (child != null) {
            String value = XmlExt.getValue(child, "type");
            UrnType parseType = UrnTypeParser.parseType(value);
            if (parseType != null) {
                device.setType(parseType);
                String value2 = XmlExt.getValue(child, "friendlyName");
                if (device.setName(value2)) {
                    String value3 = XmlExt.getValue(child, DddTag.DEVICE_MODELNAME);
                    if (device.setModelName(value3)) {
                        String value4 = XmlExt.getValue(child, DddTag.DEVICE_MODELNUMBER);
                        if (device.setModelNumber(value4)) {
                            String value5 = XmlExt.getValue(child, DddTag.DEVICE_MODELDESCRIPTION);
                            if (device.setModelDescription(value5)) {
                                String value6 = XmlExt.getValue(child, DddTag.DEVICE_MANUFACTURER);
                                if (!device.setManufacturer(value6)) {
                                    throw new InvalidDeviceException("parse device manufacturer failed, " + value6);
                                } else if (device.setManufacturerUrl(XmlExt.getValue(child, DddTag.DEVICE_MANUFACTURERURL))) {
                                    Element child2 = XmlExt.getChild(child, DddTag.SERVICES);
                                    if (child2 != null) {
                                        NodeList elementsByTagName = child2.getElementsByTagName("service");
                                        for (int i = 0; i < elementsByTagName.getLength(); i++) {
                                            device.addService(parseService((Element) elementsByTagName.item(i)));
                                        }
                                        return;
                                    }
                                    throw new InvalidServiceException("parse services failed, serviceList is null");
                                } else {
                                    throw new InvalidDeviceException("parse device manufacturer url failed, " + value6);
                                }
                            } else {
                                throw new InvalidDeviceException("parse device model description failed, " + value5);
                            }
                        } else {
                            throw new InvalidDeviceException("parse device model number failed, " + value4);
                        }
                    } else {
                        throw new InvalidDeviceException("parse device model failed, " + value3);
                    }
                } else {
                    throw new InvalidDeviceException("parse device name failed, " + value2);
                }
            } else {
                throw new InvalidDeviceException("parse device type failed, " + value);
            }
        } else {
            throw new InvalidDeviceException("parse device failed, device not found");
        }
    }

    public static void parseProperties(Service service, Element element) {
        Element child = XmlExt.getChild(element, DddTag.f4692PL);
        if (child != null) {
            NodeList elementsByTagName = child.getElementsByTagName(DddTag.PL_PROPERTY);
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                service.addProperty(parseProperty(service, (Element) elementsByTagName.item(i)));
            }
            return;
        }
        throw new InvalidPropertyException("parse properties failed, propertyList is null");
    }

    public static Property parseProperty(Service service, Element element) {
        PropertyDefinition propertyDefinition = new PropertyDefinition();
        String attribute = element.getAttribute(DddTag.PL_PROPERTY_ATTR_GETTABLE);
        if (attribute != null) {
            propertyDefinition.setGettable(Boolean.valueOf(attribute).booleanValue());
        }
        String attribute2 = element.getAttribute(DddTag.PL_PROPERTY_ATTR_NOTIFIABLE);
        if (attribute2 != null) {
            propertyDefinition.setNotifiable(Boolean.valueOf(attribute2).booleanValue());
        }
        propertyDefinition.setServiceType(service.getType().toString());
        String value = XmlExt.getValue(element, "friendlyName");
        if (value != null) {
            propertyDefinition.setFriendlyName(value);
            String value2 = XmlExt.getValue(element, "internalName");
            if (value2 != null) {
                propertyDefinition.setInternalName(value2);
                propertyDefinition.setDescription(XmlExt.getValue(element, "description"));
                String value3 = XmlExt.getValue(element, "dataType");
                if (value3 != null) {
                    DataType retrieveType = DataType.retrieveType(value3);
                    if (retrieveType != null) {
                        propertyDefinition.setDataType(retrieveType);
                        Element child = XmlExt.getChild(element, DddTag.PL_PROPERTY_ALLOWEDVALURANGE);
                        if (child != null) {
                            propertyDefinition.setAllowedValue(parseAllowedValueRange(retrieveType, child));
                        }
                        Element child2 = XmlExt.getChild(element, DddTag.PL_PROPERTY_ALLOWEDVALUELIST);
                        if (child2 != null) {
                            propertyDefinition.setAllowedValue(parseAllowedValueList(retrieveType, child2));
                        }
                        if (child2 == null && child == null) {
                            propertyDefinition.setAllowedValue(new AllowedValueAny(retrieveType));
                        }
                        return new Property(propertyDefinition);
                    }
                    throw new InvalidPropertyException("retrieveType dataType failed: " + value3);
                }
                throw new InvalidPropertyException("dataType is null");
            }
            throw new InvalidPropertyException("internalName is null");
        }
        throw new InvalidPropertyException("friendlyName is null");
    }

    public static Service parseService(Element element) {
        Service service = new Service();
        String value = XmlExt.getValue(element, "type");
        UrnType parseType = UrnTypeParser.parseType(value);
        if (parseType != null) {
            service.setType(parseType);
            String value2 = XmlExt.getValue(element, "description");
            if (value2 != null) {
                service.setDescription(value2);
            }
            parseConfigs(service, element);
            parseProperties(service, element);
            parseActions(service, element);
            return service;
        }
        throw new InvalidServiceException("parse serviceType failed, " + value);
    }

    public static void parseXml(Device device, Element element) {
        if (element.getTagName().equalsIgnoreCase(DddTag.ROOT)) {
            String attribute = element.getAttribute("xmlns");
            if (attribute == null) {
                throw new InvalidDeviceException("parse device failed, xmlns not found");
            } else if (attribute.equals(DddTag.ROOT_XMLNS)) {
                parseDevice(device, element);
            } else {
                throw new InvalidDeviceException("parse device failed, xmlns != urn:schemas-mi-com:device-1-0");
            }
        } else {
            throw new InvalidDeviceException("parse device failed, root not found");
        }
    }

    public Device parse(InputStream inputStream) {
        Device device = new Device();
        if (inputStream != null) {
            try {
                Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
                if (documentElement != null) {
                    parseXml(device, documentElement);
                    return device;
                }
                throw new InvalidDeviceException("root not found");
            } catch (Exception e) {
                e.printStackTrace();
                throw new InvalidDeviceException((Throwable) e);
            }
        } else {
            throw new InvalidDeviceException("inputstream is null");
        }
    }
}
