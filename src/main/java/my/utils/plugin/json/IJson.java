package my.utils.plugin.json;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 *
 *
 * @author heqilin
 * date:  2018-12-25 ok
 **/
public interface IJson {
    String toJson(Object obj);
    <T> T toBean(Object jsonStr,Class<T> tClass);
    <T> List<T> toList(Object jsonStr,Class<T> tClass);
}
