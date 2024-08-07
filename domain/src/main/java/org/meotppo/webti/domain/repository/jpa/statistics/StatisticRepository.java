package org.meotppo.webti.domain.repository.jpa.statistics;

import org.meotppo.webti.domain.entity.jpa.developerprofile.WebDeveloperProfile;
import org.meotppo.webti.domain.entity.jpa.statistics.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatisticRepository extends JpaRepository<Statistic, Long>, QuerydslStatisticRepository {
    Optional<Statistic> findByDeveloperProfile(WebDeveloperProfile developerProfile);
}
