package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화")
    @Test
    void passwordTest() {
        User user = new User();

        user.initPassword(() -> "abcdefgh");

        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드 요구사항에 부합하지 않아 초기화 안됨")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(() -> "aa");

        // then
        assertThat(user.getPassword()).isNull();
    }
}