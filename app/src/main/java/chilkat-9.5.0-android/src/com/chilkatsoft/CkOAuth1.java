/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkOAuth1 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkOAuth1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkOAuth1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkOAuth1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkOAuth1() {
    this(chilkatJNI.new_CkOAuth1(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkOAuth1_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkOAuth1_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkOAuth1_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_AuthorizationHeader(CkString str) {
    chilkatJNI.CkOAuth1_get_AuthorizationHeader(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String authorizationHeader() {
    return chilkatJNI.CkOAuth1_authorizationHeader(swigCPtr, this);
  }

  public void get_BaseString(CkString str) {
    chilkatJNI.CkOAuth1_get_BaseString(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String baseString() {
    return chilkatJNI.CkOAuth1_baseString(swigCPtr, this);
  }

  public void get_ConsumerKey(CkString str) {
    chilkatJNI.CkOAuth1_get_ConsumerKey(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String consumerKey() {
    return chilkatJNI.CkOAuth1_consumerKey(swigCPtr, this);
  }

  public void put_ConsumerKey(String newVal) {
    chilkatJNI.CkOAuth1_put_ConsumerKey(swigCPtr, this, newVal);
  }

  public void get_ConsumerSecret(CkString str) {
    chilkatJNI.CkOAuth1_get_ConsumerSecret(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String consumerSecret() {
    return chilkatJNI.CkOAuth1_consumerSecret(swigCPtr, this);
  }

  public void put_ConsumerSecret(String newVal) {
    chilkatJNI.CkOAuth1_put_ConsumerSecret(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkOAuth1_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkOAuth1_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkOAuth1_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_EncodedSignature(CkString str) {
    chilkatJNI.CkOAuth1_get_EncodedSignature(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encodedSignature() {
    return chilkatJNI.CkOAuth1_encodedSignature(swigCPtr, this);
  }

  public void get_GeneratedUrl(CkString str) {
    chilkatJNI.CkOAuth1_get_GeneratedUrl(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String generatedUrl() {
    return chilkatJNI.CkOAuth1_generatedUrl(swigCPtr, this);
  }

  public void get_HmacKey(CkString str) {
    chilkatJNI.CkOAuth1_get_HmacKey(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hmacKey() {
    return chilkatJNI.CkOAuth1_hmacKey(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkOAuth1_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkOAuth1_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkOAuth1_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkOAuth1_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkOAuth1_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkOAuth1_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkOAuth1_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkOAuth1_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_Nonce(CkString str) {
    chilkatJNI.CkOAuth1_get_Nonce(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String nonce() {
    return chilkatJNI.CkOAuth1_nonce(swigCPtr, this);
  }

  public void put_Nonce(String newVal) {
    chilkatJNI.CkOAuth1_put_Nonce(swigCPtr, this, newVal);
  }

  public void get_OauthMethod(CkString str) {
    chilkatJNI.CkOAuth1_get_OauthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oauthMethod() {
    return chilkatJNI.CkOAuth1_oauthMethod(swigCPtr, this);
  }

  public void put_OauthMethod(String newVal) {
    chilkatJNI.CkOAuth1_put_OauthMethod(swigCPtr, this, newVal);
  }

  public void get_OauthUrl(CkString str) {
    chilkatJNI.CkOAuth1_get_OauthUrl(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oauthUrl() {
    return chilkatJNI.CkOAuth1_oauthUrl(swigCPtr, this);
  }

  public void put_OauthUrl(String newVal) {
    chilkatJNI.CkOAuth1_put_OauthUrl(swigCPtr, this, newVal);
  }

  public void get_OauthVersion(CkString str) {
    chilkatJNI.CkOAuth1_get_OauthVersion(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oauthVersion() {
    return chilkatJNI.CkOAuth1_oauthVersion(swigCPtr, this);
  }

  public void put_OauthVersion(String newVal) {
    chilkatJNI.CkOAuth1_put_OauthVersion(swigCPtr, this, newVal);
  }

  public void get_QueryString(CkString str) {
    chilkatJNI.CkOAuth1_get_QueryString(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String queryString() {
    return chilkatJNI.CkOAuth1_queryString(swigCPtr, this);
  }

  public void get_Realm(CkString str) {
    chilkatJNI.CkOAuth1_get_Realm(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String realm() {
    return chilkatJNI.CkOAuth1_realm(swigCPtr, this);
  }

  public void put_Realm(String newVal) {
    chilkatJNI.CkOAuth1_put_Realm(swigCPtr, this, newVal);
  }

  public void get_Signature(CkString str) {
    chilkatJNI.CkOAuth1_get_Signature(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String signature() {
    return chilkatJNI.CkOAuth1_signature(swigCPtr, this);
  }

  public void get_SignatureMethod(CkString str) {
    chilkatJNI.CkOAuth1_get_SignatureMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String signatureMethod() {
    return chilkatJNI.CkOAuth1_signatureMethod(swigCPtr, this);
  }

  public void put_SignatureMethod(String newVal) {
    chilkatJNI.CkOAuth1_put_SignatureMethod(swigCPtr, this, newVal);
  }

  public void get_Timestamp(CkString str) {
    chilkatJNI.CkOAuth1_get_Timestamp(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String timestamp() {
    return chilkatJNI.CkOAuth1_timestamp(swigCPtr, this);
  }

  public void put_Timestamp(String newVal) {
    chilkatJNI.CkOAuth1_put_Timestamp(swigCPtr, this, newVal);
  }

  public void get_Token(CkString str) {
    chilkatJNI.CkOAuth1_get_Token(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String token() {
    return chilkatJNI.CkOAuth1_token(swigCPtr, this);
  }

  public void put_Token(String newVal) {
    chilkatJNI.CkOAuth1_put_Token(swigCPtr, this, newVal);
  }

  public void get_TokenSecret(CkString str) {
    chilkatJNI.CkOAuth1_get_TokenSecret(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tokenSecret() {
    return chilkatJNI.CkOAuth1_tokenSecret(swigCPtr, this);
  }

  public void put_TokenSecret(String newVal) {
    chilkatJNI.CkOAuth1_put_TokenSecret(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkOAuth1_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkOAuth1_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkOAuth1_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkOAuth1_version(swigCPtr, this);
  }

  public boolean AddParam(String name, String value) {
    return chilkatJNI.CkOAuth1_AddParam(swigCPtr, this, name, value);
  }

  public boolean Generate() {
    return chilkatJNI.CkOAuth1_Generate(swigCPtr, this);
  }

  public boolean GenNonce(int numBytes) {
    return chilkatJNI.CkOAuth1_GenNonce(swigCPtr, this, numBytes);
  }

  public boolean GenTimestamp() {
    return chilkatJNI.CkOAuth1_GenTimestamp(swigCPtr, this);
  }

  public boolean RemoveParam(String name) {
    return chilkatJNI.CkOAuth1_RemoveParam(swigCPtr, this, name);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkOAuth1_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetRsaKey(CkPrivateKey privKey) {
    return chilkatJNI.CkOAuth1_SetRsaKey(swigCPtr, this, CkPrivateKey.getCPtr(privKey), privKey);
  }

}
