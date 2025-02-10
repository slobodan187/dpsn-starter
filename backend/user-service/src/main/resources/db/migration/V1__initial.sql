DO
$$
	BEGIN
		IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'dpsn') THEN
			CREATE DATABASE dpsn;
		END IF;
	END
$$;

CREATE TYPE user_status_enum AS ENUM ('ACTIVE', 'PASSIVE', 'SUSPENDED');
CREATE TYPE user_type_enum AS ENUM ('USER', 'ADMIN');

DO
$$
	BEGIN
		IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'user') THEN
			CREATE TABLE "user"
			(
				id           VARCHAR(255) PRIMARY KEY,
				email        VARCHAR(255)     NOT NULL,
				first_name   VARCHAR(255),
				last_name    VARCHAR(255),
				phone_number VARCHAR(20),
				user_status  user_status_enum NOT NULL,
				user_type    user_type_enum   NOT NULL,
				password     VARCHAR(255)     NOT NULL,
				created_at   TIMESTAMP        NOT NULL DEFAULT CURRENT_TIMESTAMP,
				created_by   VARCHAR(255),
				updated_at   TIMESTAMP,
				updated_by   VARCHAR(255)
			);

			-- Create indexes only if the table was just created
			CREATE INDEX idx_user_email ON "user" (email);
			CREATE INDEX idx_user_status ON "user" (user_status);
			CREATE INDEX idx_user_type ON "user" (user_type);
		END IF;
	END
$$;
