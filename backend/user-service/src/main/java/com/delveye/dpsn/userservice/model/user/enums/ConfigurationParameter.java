package com.delveye.dpsn.userservice.model.user.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ConfigurationParameter {

	AUTH_ACCESS_TOKEN_EXPIRE_MINUTE("30"), AUTH_REFRESH_TOKEN_EXPIRE_DAY("1"), AUTH_PUBLIC_KEY("""
		-----BEGIN PUBLIC KEY-----
		MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtknZxoQeffbb90olMJgH
		wi3EL19LB6mMb4cDQexJlxgMmlRx+bl5V8rxftt0H3J7ZaVs1gVXU/A7FMUwMrrG
		MQo/vIajt5az1GIwEgpY7pd1jLjKguRrtX5UjmxsnOzKC2q61lhKcfq8DHnToHbi
		UQz7Zm7R0i2+fe/1nBDdHCAA+dYbGC9wdq4XpdqQ4LdLmxFqZO7bvkCoXQ+udlFJ
		z/j7a5GorhkMyRG0sabg5bAf/Ht8+FR8Jkwodx7A4k6e+Rg4a/C16cEUiuP10ozt
		+vpvDtvYVwIwmdDJGZEpTOX7hmyTJR1u+BDqZinCbua6mCnY1THRvNrhcTHERDQj
		dwIDAQAB
		-----END PUBLIC KEY-----

		"""), AUTH_PRIVATE_KEY("""
		-----BEGIN PRIVATE KEY-----
		MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC2SdnGhB599tv3
		SiUwmAfCLcQvX0sHqYxvhwNB7EmXGAyaVHH5uXlXyvF+23QfcntlpWzWBVdT8DsU
		xTAyusYxCj+8hqO3lrPUYjASCljul3WMuMqC5Gu1flSObGyc7MoLarrWWEpx+rwM
		edOgduJRDPtmbtHSLb597/WcEN0cIAD51hsYL3B2rhel2pDgt0ubEWpk7tu+QKhd
		D652UUnP+PtrkaiuGQzJEbSxpuDlsB/8e3z4VHwmTCh3HsDiTp75GDhr8LXpwRSK
		4/XSjO36+m8O29hXAjCZ0MkZkSlM5fuGbJMlHW74EOpmKcJu5rqYKdjVMdG82uFx
		McRENCN3AgMBAAECggEABNnwo0wMhF1dBkxMCBU2Y6W/KmRBWsSu5Er2EbuS9nlL
		4JGYb5p5jxYWGO0Ik/ZX2raChSxNjNeAYwb1HOyD7iCFM2Rr7Vdj6tDq0ZgX53r9
		bw998uosWaoGixHPTtqDGAxbnkJpnMtHqkIAbq1V9u0/BZSzyIGyJ6eKuaq95QvY
		tKOqlHsIikeU4nkX/RKaSYnKPL8H298DUOHiufLhzsACqzab5DMPjOvQFj/nXrQL
		bJyGpAIZazhGmowxWbyAkKItUEoaS8tb5dA+sy8qqejZbQLaI5fTbutgyQhS8JnM
		FQh2e1fUIaURId33WTwlJhfBa6LZcv3vUwD5WggOCQKBgQD7BFRGCJWzeTzGEoYT
		Wbq8wuJYskAbAy68iH4jHORi4eCou75Q6tywKgT3xr1P/6YRYnLskx5muLZ2WdeP
		EOxnDwxrtGwO5MhAlJoZtmwtYf7uCVa6Exgvt2/xoXK6PEoMuiu1NDyLa9Q94zm1
		uhZajHZ0UHrSS/9qWrReE2m4aQKBgQC56D4pSce5hPJumr7PWrhzU/PnIL+9Ji+E
		kKfQTxYYkczePKoPKV+sZWlmlI+mF4PWSmQQ0YU7B2zeiiqD2d6KoGDjUzv2ODj9
		R0NNSKURXI7j5R2FoJuMYeFJ5LdgnlvjOkEuyyLeMcUiSJrKaGskWMWKuGORdNAR
		dIdgaqiA3wKBgQDP38DuknNuwqsKmRKBeeCEK5wIue0Osa8FoL9c0rNsFATZl0i/
		eBA0r0eX7fSfCGZ9pRrpQdh+Vt972WEC8I/ltPejRjHqj5oqqSWIv6KMXsggVomE
		5QU1luLUps/83KqyKYbCtDSjfTOx4LfNAAM9D2+VWYStHRSy/dS6x7bYaQKBgQCz
		p7jyo4csREsYEdkVf0FCyj2o/R/uBYnkHPrfNp5Ozg9iMNPS5RO9AR+zbxvG0XCp
		VKiRDDkpS0qtYG4njxMdelFHPbdzgO+p7AUhGXPTbFP17gLykLvhFPHnO+zupPp9
		g11cgBhJC2XLdMiJlBD+Rf9YyEoIVg+A3tC4nzoJlwKBgQCa3ghXYDTDtafGtLxI
		ct6iSG2jz10s7W+wmVQx29AVqzJ0liKt5E1SmkMoWjYbNgrviUVuDDObm7HnZ9o8
		ZDXMUtdN3d2YuNh8s2kZCJ3XXWPor5jJXuJrZcuwEpJ2fhMfmFYhxkCq0q+d/R+K
		VM87HWKyMXVTr8oLa9pVP2seAw==
		-----END PRIVATE KEY-----
		""");

	private final String defaultValue;
}
