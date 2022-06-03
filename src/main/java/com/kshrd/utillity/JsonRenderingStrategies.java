package com.kshrd.utillity;

import org.mybatis.dynamic.sql.BindableColumn;
import org.mybatis.dynamic.sql.render.MyBatis3RenderingStrategy;


/** NOT USE */
public class JsonRenderingStrategies extends MyBatis3RenderingStrategy {

    @Override
    public String getFormattedJdbcPlaceholder(BindableColumn<?> column, String prefix, String parameterName) {
        return super.getFormattedJdbcPlaceholder(column, prefix, parameterName)+"::json";
    }
}