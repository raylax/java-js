package org.inurl.js.runtime.builtin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标注为js可调用方法
 * 参数必须为{@code List<AbstractJsObject<Object>> arguments}
 * @author raylax
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Function {
}
