package com.example.coffee;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class JdbcUtils {

    private JdbcUtils() {
        // util 클래스는 static 메소드만 가지고 있기 때문에 생성자를 private로 만들어주어 다른 곳에서 생성할 수 없도록 한다.
    }

    public static LocalDateTime toLocalDateTime(Timestamp timestamp) {
        return timestamp != null ? timestamp.toLocalDateTime() : null;
    }
}
