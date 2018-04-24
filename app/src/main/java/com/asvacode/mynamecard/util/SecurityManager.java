package com.asvacode.mynamecard.util;

/**
 * Created by cheasocheat on 4/24/18.
 */

public class SecurityManager {

    // Used to load the 'secure-lib' library on application startup.
    static {
        System.loadLibrary("secure-lib");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
