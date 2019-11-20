package com.github.edgar615.nef.message.sms;

import com.github.edgar615.message.core.Event;
import com.github.edgar615.message.core.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CodeGen at Wed Nov 20 09:21:43 CST 2019
 * @author CodeGen
 */
public final class SendSmsVerifyCodeForRegisterMessageBuilder {
  private static final String to = "v1.job.sms.verifycode.send";

  private static final String resource = "register";

  private static final Map<String, String> ext = new HashMap<>();

  private Long appId;

  private String phoneNumber;

  private String id;

  private SendSmsVerifyCodeForRegisterMessageBuilder() {
  }

  public static SendSmsVerifyCodeForRegisterMessageBuilder builder() {
    return new SendSmsVerifyCodeForRegisterMessageBuilder();
  }

  public SendSmsVerifyCodeForRegisterMessageBuilder setAppId(Long appId) {
    this.appId = appId;
    return this;
  }

  public SendSmsVerifyCodeForRegisterMessageBuilder setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public SendSmsVerifyCodeForRegisterMessageBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public SendSmsVerifyCodeForRegisterMessageBuilder addExt(String key, String value) {
    this.ext.put(key, value);
    return this;
  }

  public Message build() {
    Objects.requireNonNull(appId, "appId can not be null");
    Objects.requireNonNull(phoneNumber, "phoneNumber can not be null");
    Objects.requireNonNull(id, "id can not be null");
    Objects.requireNonNull(to, "to can not be null");
    Objects.requireNonNull(resource, "resource can not be null");
    Map<String, Object> content = new HashMap();
    content.put("appId", appId);
    content.put("phoneNumber", phoneNumber);
    Event body = Event.create(resource, content);
    Message message = Message.create(id, to, body);
    message.header().addExts(ext);
    return message;
  }
}
