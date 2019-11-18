package com.github.edgar615.nef.message.sms;

/**
 * 发送验证码短信
 * @author Administrator
 */
public class SendSmsVerifyCodeMessage {

  /**
   * 应用ID
   */
  private Long appId;

  /**
   * 手机号码
   */
  private String phoneNumber;

  /**
   * 标识符
   */
  private String identifier;

  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }
}
