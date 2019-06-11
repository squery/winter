package com.zy.dto;

import java.util.HashMap;
import java.util.Map;

public class DevConfig {

    private String host;

    private Integer port;

    private String subDevPole; //每个分机号，里每排带的采集盒数

    private String subCollectType; //每个分机 里面每排采集合的类型

    private Map<String, Integer> subDevPoleNumMap = new HashMap<String, Integer>();
    private Map<String, Integer> subCollectTypeNumMap = new HashMap<String, Integer>();

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getSubDevPole() {
        return subDevPole;
    }

    public String getSubCollectType() {
        return subCollectType;
    }

    public void setSubDevPole(String subDevPole) {
        if (subDevPole != null && !subDevPole.isEmpty()) {
            String[] array = subDevPole.split(",");
            for (String ar : array) {
                String[] keyValue = ar.split("=");
                if (keyValue == null || keyValue.length != 2) {
                    continue;
                }

                int value = parseString2Int(keyValue[1]);
                if (value == -1) {
                    continue;
                }
                subDevPoleNumMap.put(keyValue[0], value);
            }
        }
        this.subDevPole = subDevPole;
    }

    public void setSubCollectType(String subCollectType) {
        if (subCollectType != null && !subCollectType.isEmpty()) {
            String[] array = subCollectType.split(",");
            for (String ar : array) {
                String[] keyValue = ar.split("=");
                if (keyValue == null || keyValue.length != 2) {
                    continue;
                }

                int value = parseString2Int(keyValue[1]);
                if (value == -1) {
                    continue;
                }
                subCollectTypeNumMap.put(keyValue[0], value);
            }
        }
        this.subCollectType = subCollectType;
    }

    public Map<String, Integer> getSubCollectTypeNumMap() {
        return subCollectTypeNumMap;
    }

    public Map<String, Integer> getSubDevPoleNumMap() {
        return subDevPoleNumMap;
    }

    private Integer parseString2Int(String value) {
        try {
            return Integer.parseInt(value);

        } catch (Exception e) {
            return -1;
        }
    }
}
