package com.hss.factory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface AbstractFactory {

    public Object getBeanByBeanName(String beanName);

    public Map<String,Object> getBeanMap();

    public List<String> getClassNames();
}
