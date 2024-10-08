package org.meotppo.webti.dto.result;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.meotppo.webti.domain.entity.type.MbtiType;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestResultRequest {

    @NotNull(message = "MBTI type cannot be null")
    private MbtiType mbtiType;

    @NotNull(message = "Match cannot be null")
    private Boolean match;
}
