package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;

class MenuWrapperICS extends BaseMenuWrapper<SupportMenu> implements Menu {
    MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context, supportMenu);
    }

    public MenuItem add(int i) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((SupportMenu) this.mWrappedObject).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = getMenuItemWrapper(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return getSubMenuWrapper(((SupportMenu) this.mWrappedObject).addSubMenu(charSequence));
    }

    public void clear() {
        internalClear();
        ((SupportMenu) this.mWrappedObject).clear();
    }

    public void close() {
        ((SupportMenu) this.mWrappedObject).close();
    }

    public MenuItem findItem(int i) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).findItem(i));
    }

    public MenuItem getItem(int i) {
        return getMenuItemWrapper(((SupportMenu) this.mWrappedObject).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((SupportMenu) this.mWrappedObject).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((SupportMenu) this.mWrappedObject).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((SupportMenu) this.mWrappedObject).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((SupportMenu) this.mWrappedObject).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        internalRemoveGroup(i);
        ((SupportMenu) this.mWrappedObject).removeGroup(i);
    }

    public void removeItem(int i) {
        internalRemoveItem(i);
        ((SupportMenu) this.mWrappedObject).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((SupportMenu) this.mWrappedObject).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((SupportMenu) this.mWrappedObject).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((SupportMenu) this.mWrappedObject).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((SupportMenu) this.mWrappedObject).setQwertyMode(z);
    }

    public int size() {
        return ((SupportMenu) this.mWrappedObject).size();
    }
}
