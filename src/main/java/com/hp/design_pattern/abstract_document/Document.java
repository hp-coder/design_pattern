package com.hp.design_pattern.abstract_document;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 抽象文档
 * <p>
 * 应用
 * 1. 动态添加属性
 * 2. 像树结构，但更灵活的管理领域对象
 * 3. 低耦合系统
 *
 * @author HP
 */
public interface Document {

    void put(String key, Object value);

    Object get(String key);

    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
