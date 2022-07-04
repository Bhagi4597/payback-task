package com.payback.appiumtest.base

class Constants {
    companion object {
        //launch page
        val APP_NAME = "//android.widget.TextView[@content-desc='PAYBACK']"

        // Login page
        val LOGIN_BUTTON = "de.payback.client.android:id/welcome_loginbutton"
        val USERNAME_FIELD = "de.payback.client.android:id/welcome_loginbutton"
        val PASSWORD_FIELD = "de.payback.client.android:id/welcome_loginbutton"

        //coupon page
        val AKTUELL_TAB = "//android.widget.TextView[@text='Aktuell']"
        val KARTE_TAB = "//android.widget.TextView[@text='Karte+PAY']"
        val COUPON_TAB = "//android.widget.TextView[@text='Coupons']"
        val ONLINE_SHOPS_TAB = "//android.widget.TextView[@text='OnlineShops']"
        val SERVICES_TAB = "//android.widget.TextView[@text='Services']"
        val COUPON_PAGE_FILTER_BUTTON = "de.payback.client.android:id/filter_button"
        val COUPON_PAGE_TEXT1 = "//android.widget.TextView[contains(@text,'Nicht aktiviert')]"
        val COUPON_PAGE_TEXT2 = "//android.widget.TextView[contains(@text,'Aktiviert')]"
        val ALL_COUPON = "//android.widget.ImageView[@resource-id='de.payback.client.android:id/image']"
        // filter page
        val FILTER_PAGE_RESET_BUTTON = "de.payback.client.android:id/coupon_action_reset"
        val FILTER_PAGE_HEADLINE = "de.payback.client.android:id/headline"
        val FILTER_PAGE_DONE_BUTTON = "de.payback.client.android:id/done"
        val SELECTED_REWE_COUPON = "//android.widget.Button[@text='REWE']"
        //android.widget.Button[@text='Jetzt aktivieren']
        val COUPON_ACTIVATE_BUTTON = "de.payback.client.android:id/not_activated_button"
        val COUPON_DEACTIVATE_BUTTON = "de.payback.client.android:id/redeem_offline_button"

    }
}