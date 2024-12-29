package org.eclipse.jetty.servlet;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import javax.servlet.http.HttpServlet;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.server.handler.C9952j;
import p152e6.C9001b;
import p152e6.C9003c;
import p239z5.C12170f;
import p239z5.C12175i;
import p239z5.C12187r;

public class StatisticsServlet extends HttpServlet {
    private static final C9003c LOG = C9001b.m21450a(StatisticsServlet.class);
    private C12170f[] _connectors;
    private MemoryMXBean _memoryBean;
    boolean _restrictToLocalhost = true;
    private C9952j _statsHandler;

    private void sendTextResponse(C9279c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this._statsHandler.mo40013v1());
        sb.append("<h2>Connections:</h2>\n");
        C12170f[] fVarArr = this._connectors;
        int length = fVarArr.length;
        int i = 0;
        while (true) {
            String str = "<br />\n";
            if (i < length) {
                C12170f fVar = fVarArr[i];
                sb.append("<h3>");
                sb.append(fVar.getName());
                sb.append("</h3>");
                if (fVar.mo42925R()) {
                    sb.append("Statistics gathering started ");
                    sb.append(fVar.mo42943e0());
                    sb.append("ms ago");
                    sb.append(str);
                    sb.append("Total connections: ");
                    sb.append(fVar.mo42919J());
                    sb.append(str);
                    sb.append("Current connections open: ");
                    sb.append(fVar.mo42959q0());
                    sb.append("Max concurrent connections open: ");
                    sb.append(fVar.mo42963y());
                    sb.append(str);
                    sb.append("Total connections duration: ");
                    sb.append(fVar.mo42924Q());
                    sb.append(str);
                    sb.append("Mean connection duration: ");
                    sb.append(fVar.mo42923O());
                    sb.append(str);
                    sb.append("Max connection duration: ");
                    sb.append(fVar.mo42921L());
                    sb.append(str);
                    sb.append("Connection duration standard deviation: ");
                    sb.append(fVar.mo42935Y());
                    sb.append(str);
                    sb.append("Total requests: ");
                    sb.append(fVar.mo42957m0());
                    sb.append(str);
                    sb.append("Mean requests per connection: ");
                    sb.append(fVar.mo42917H());
                    sb.append(str);
                    sb.append("Max requests per connection: ");
                    sb.append(fVar.mo42958o0());
                    sb.append(str);
                    sb.append("Requests per connection standard deviation: ");
                    sb.append(fVar.mo42918I());
                } else {
                    str = "Statistics gathering off.\n";
                }
                sb.append(str);
                i++;
            } else {
                sb.append("<h2>Memory:</h2>\n");
                sb.append("Heap memory usage: ");
                sb.append(this._memoryBean.getHeapMemoryUsage().getUsed());
                sb.append(" bytes");
                sb.append(str);
                sb.append("Non-heap memory usage: ");
                sb.append(this._memoryBean.getNonHeapMemoryUsage().getUsed());
                sb.append(" bytes");
                sb.append(str);
                cVar.mo39906c("text/html");
                cVar.mo37796f().write(sb.toString());
                return;
            }
        }
    }

    private void sendXmlResponse(C9279c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("<statistics>\n");
        sb.append("  <requests>\n");
        sb.append("    <statsOnMs>");
        sb.append(this._statsHandler.mo39994e0());
        sb.append("</statsOnMs>\n");
        sb.append("    <requests>");
        sb.append(this._statsHandler.mo40003m0());
        sb.append("</requests>\n");
        sb.append("    <requestsActive>");
        sb.append(this._statsHandler.mo40001k1());
        sb.append("</requestsActive>\n");
        sb.append("    <requestsActiveMax>");
        sb.append(this._statsHandler.mo40002l1());
        sb.append("</requestsActiveMax>\n");
        sb.append("    <requestsTimeTotal>");
        sb.append(this._statsHandler.mo40000j1());
        sb.append("</requestsTimeTotal>\n");
        sb.append("    <requestsTimeMean>");
        sb.append(this._statsHandler.mo39998h1());
        sb.append("</requestsTimeMean>\n");
        sb.append("    <requestsTimeMax>");
        sb.append(this._statsHandler.mo39997g1());
        sb.append("</requestsTimeMax>\n");
        sb.append("    <requestsTimeStdDev>");
        sb.append(this._statsHandler.mo39999i1());
        sb.append("</requestsTimeStdDev>\n");
        sb.append("    <dispatched>");
        sb.append(this._statsHandler.mo39988Y0());
        sb.append("</dispatched>\n");
        sb.append("    <dispatchedActive>");
        sb.append(this._statsHandler.mo39989Z0());
        sb.append("</dispatchedActive>\n");
        sb.append("    <dispatchedActiveMax>");
        sb.append(this._statsHandler.mo39990a1());
        sb.append("</dispatchedActiveMax>\n");
        sb.append("    <dispatchedTimeTotal>");
        sb.append(this._statsHandler.mo39995e1());
        sb.append("</dispatchedTimeTotal>\n");
        sb.append("    <dispatchedTimeMean");
        sb.append(this._statsHandler.mo39992c1());
        sb.append("</dispatchedTimeMean>\n");
        sb.append("    <dispatchedTimeMax>");
        sb.append(this._statsHandler.mo39991b1());
        sb.append("</dispatchedTimeMax>\n");
        sb.append("    <dispatchedTimeStdDev");
        sb.append(this._statsHandler.mo39993d1());
        sb.append("</dispatchedTimeStdDev>\n");
        sb.append("    <requestsSuspended>");
        sb.append(this._statsHandler.mo40011t1());
        sb.append("</requestsSuspended>\n");
        sb.append("    <requestsExpired>");
        sb.append(this._statsHandler.mo39996f1());
        sb.append("</requestsExpired>\n");
        sb.append("    <requestsResumed>");
        sb.append(this._statsHandler.mo40010s1());
        sb.append("</requestsResumed>\n");
        sb.append("  </requests>\n");
        sb.append("  <responses>\n");
        sb.append("    <responses1xx>");
        sb.append(this._statsHandler.mo40004m1());
        sb.append("</responses1xx>\n");
        sb.append("    <responses2xx>");
        sb.append(this._statsHandler.mo40005n1());
        sb.append("</responses2xx>\n");
        sb.append("    <responses3xx>");
        sb.append(this._statsHandler.mo40006o1());
        sb.append("</responses3xx>\n");
        sb.append("    <responses4xx>");
        sb.append(this._statsHandler.mo40007p1());
        sb.append("</responses4xx>\n");
        sb.append("    <responses5xx>");
        sb.append(this._statsHandler.mo40008q1());
        sb.append("</responses5xx>\n");
        sb.append("    <responsesBytesTotal>");
        sb.append(this._statsHandler.mo40009r1());
        sb.append("</responsesBytesTotal>\n");
        sb.append("  </responses>\n");
        sb.append("  <connections>\n");
        for (C12170f fVar : this._connectors) {
            sb.append("    <connector>\n");
            sb.append("      <name>");
            sb.append(fVar.getName());
            sb.append("</name>\n");
            sb.append("      <statsOn>");
            sb.append(fVar.mo42925R());
            sb.append("</statsOn>\n");
            if (fVar.mo42925R()) {
                sb.append("    <statsOnMs>");
                sb.append(fVar.mo42943e0());
                sb.append("</statsOnMs>\n");
                sb.append("    <connections>");
                sb.append(fVar.mo42919J());
                sb.append("</connections>\n");
                sb.append("    <connectionsOpen>");
                sb.append(fVar.mo42959q0());
                sb.append("</connectionsOpen>\n");
                sb.append("    <connectionsOpenMax>");
                sb.append(fVar.mo42963y());
                sb.append("</connectionsOpenMax>\n");
                sb.append("    <connectionsDurationTotal>");
                sb.append(fVar.mo42924Q());
                sb.append("</connectionsDurationTotal>\n");
                sb.append("    <connectionsDurationMean>");
                sb.append(fVar.mo42923O());
                sb.append("</connectionsDurationMean>\n");
                sb.append("    <connectionsDurationMax>");
                sb.append(fVar.mo42921L());
                sb.append("</connectionsDurationMax>\n");
                sb.append("    <connectionsDurationStdDev>");
                sb.append(fVar.mo42935Y());
                sb.append("</connectionsDurationStdDev>\n");
                sb.append("    <requests>");
                sb.append(fVar.mo42957m0());
                sb.append("</requests>\n");
                sb.append("    <connectionsRequestsMean>");
                sb.append(fVar.mo42917H());
                sb.append("</connectionsRequestsMean>\n");
                sb.append("    <connectionsRequestsMax>");
                sb.append(fVar.mo42958o0());
                sb.append("</connectionsRequestsMax>\n");
                sb.append("    <connectionsRequestsStdDev>");
                sb.append(fVar.mo42918I());
                sb.append("</connectionsRequestsStdDev>\n");
            }
            sb.append("    </connector>\n");
        }
        sb.append("  </connections>\n");
        sb.append("  <memory>\n");
        sb.append("    <heapMemoryUsage>");
        sb.append(this._memoryBean.getHeapMemoryUsage().getUsed());
        sb.append("</heapMemoryUsage>\n");
        sb.append("    <nonHeapMemoryUsage>");
        sb.append(this._memoryBean.getNonHeapMemoryUsage().getUsed());
        sb.append("</nonHeapMemoryUsage>\n");
        sb.append("  </memory>\n");
        sb.append("</statistics>\n");
        cVar.mo39906c("text/xml");
        cVar.mo37796f().write(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void doGet(C9277a aVar, C9279c cVar) {
        if (this._statsHandler == null) {
            LOG.mo36847b("Statistics Handler not installed!", new Object[0]);
            cVar.mo37778k(TypedValues.PositionType.TYPE_PERCENT_WIDTH);
        } else if (!this._restrictToLocalhost || "127.0.0.1".equals(aVar.mo41948h())) {
            String o = aVar.mo41951o("xml");
            if (o == null) {
                o = aVar.mo41951o("XML");
            }
            if (o == null || !"true".equalsIgnoreCase(o)) {
                sendTextResponse(cVar);
            } else {
                sendXmlResponse(cVar);
            }
        } else {
            cVar.mo37778k(TypedValues.PositionType.TYPE_PERCENT_WIDTH);
        }
    }

    public void doPost(C9277a aVar, C9279c cVar) {
        doGet(aVar, cVar);
    }

    public void init() {
        C12187r c = ((C9943d.C9945b) getServletContext()).mo39960d().mo39919c();
        C12175i Q0 = c.mo39923Q0(C9952j.class);
        if (Q0 != null) {
            this._statsHandler = (C9952j) Q0;
            this._memoryBean = ManagementFactory.getMemoryMXBean();
            this._connectors = c.mo43168U0();
            if (getInitParameter("restrictToLocalhost") != null) {
                this._restrictToLocalhost = "true".equals(getInitParameter("restrictToLocalhost"));
                return;
            }
            return;
        }
        LOG.mo36847b("Statistics Handler not installed!", new Object[0]);
    }
}
