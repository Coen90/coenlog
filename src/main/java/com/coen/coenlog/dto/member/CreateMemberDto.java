package com.coen.coenlog.dto.member;

import com.coen.coenlog.domain.member.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CreateMemberDto {

    public String email;
    
    public String username;
    
    public String password;
    
    public Role role;

    @Builder
    public CreateMemberDto(String email, String username, String password, Role role) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
