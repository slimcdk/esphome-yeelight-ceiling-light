package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationPresenter implements MenuPresenter {

    /* renamed from: id */
    private int f3102id;
    private MenuBuilder menu;
    private BottomNavigationMenuView menuView;
    private boolean updateSuspended = false;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int selectedItemId;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
        }
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public int getId() {
        return this.f3102id;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.menu = menuBuilder;
        this.menuView.initialize(menuBuilder);
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.menuView.tryRestoreSelectedItemId(((SavedState) parcelable).selectedItemId);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        return savedState;
    }

    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setBottomNavigationMenuView(BottomNavigationMenuView bottomNavigationMenuView) {
        this.menuView = bottomNavigationMenuView;
    }

    public void setCallback(MenuPresenter.Callback callback) {
    }

    public void setId(int i) {
        this.f3102id = i;
    }

    public void setUpdateSuspended(boolean z) {
        this.updateSuspended = z;
    }

    public void updateMenuView(boolean z) {
        if (!this.updateSuspended) {
            if (z) {
                this.menuView.buildMenuView();
            } else {
                this.menuView.updateMenuView();
            }
        }
    }
}
