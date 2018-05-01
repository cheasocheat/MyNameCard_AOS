#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_asvacode_mynamecard_util_SecurityManager_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jstring
JNICALL
Java_com_asvacode_mynamecard_util_SecurityManager_getDatabaseName(
        JNIEnv *env,
jobject /* this */) {
std::string hello = "db_mobile.db";
return env->NewStringUTF(hello.c_str());
}