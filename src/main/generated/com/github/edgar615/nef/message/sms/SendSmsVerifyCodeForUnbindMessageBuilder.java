package com.github.edgar615.nef.message.sms;

import com.github.edgar615.message.core.Event;
import com.github.edgar615.message.core.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CodeGen at Tue Nov 19 18:13:38 CST 2019
 * @author CodeGen
 */
public final class SendSmsVerifyCodeForUnbindMessageBuilder {
  private static final String to = "v1.job.sms.verifycode.send";

  private static final String resource = "unbind";

  private static final Map<String, String> ext = new HashMap<>();

  private Long appId;

  private String phoneNumber;

  private String id;

  private SendSmsVerifyCodeForUnbindMessageBuilder() {
  }

  public static SendSmsVerifyCodeForUnbindMessageBuilder builder() {
    return new SendSmsVerifyCodeForUnbindMessageBuilder();
  }

  public SendSmsVerifyCodeForUnbindMessageBuilder setAppId(Long appId) {
    this.appId = appId;
    return this;
  }

  public SendSmsVerifyCodeForUnbindMessageBuilder setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public SendSmsVerifyCodeForUnbindMessageBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public SendSmsVerifyCodeForUnbindMessageBuilder addExt(String key, String value) {
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
