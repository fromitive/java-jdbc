package com.techcourse.support;

import com.interface21.dao.DataAccessException;
import java.sql.SQLException;

public class SQLExceptionConsumer {
    public static <R> R execute(CheckedExceptionExecutor<R, SQLException> exceptionExecutor, String errorMessage) {
        try {
            return exceptionExecutor.execute();
        } catch (Exception e) {
            throw new DataAccessException(errorMessage);
        }
    }
}
