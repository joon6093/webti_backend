package org.meotppo.webti.domain.entity.jpa.result;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.meotppo.webti.domain.entity.jpa.common.JpaEntityDate;
import org.meotppo.webti.domain.entity.jpa.profile.Profile;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Statistic extends JpaEntityDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statistic_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

    @Column(nullable = false)
    private Long count;

    @Column(nullable = false)
    private Long matchCount;

    @Builder
    public Statistic(Profile profile, Long count, Long matchCount) {
        this.profile = profile;
        this.count = count;
        this.matchCount = matchCount;
    }

    public void updateCount(Long count) {
        this.count = count;
    }

    public void updateMatchCount(Long matchCount) {
        this.matchCount = matchCount;
    }
}
