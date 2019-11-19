package com.github.edgar615.nef.message.sms;

import com.github.edgar615.message.codegen.BuildCodgen;
import com.github.edgar615.message.codegen.NotNull;

/**
 * 发送登录的验证码
 *
 * @author Administrator
 */
@BuildCodgen(to = "v1.job.sms.verifycode.send", resource = "login")
public class SendSmsVerifyCodeForLoginMessage {

  /**
   * 应用ID
   */
  @NotNull
  private Long appId;

  /**
   * 手机号码
   */
  @NotNull
  private String phoneNumber;

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

}
