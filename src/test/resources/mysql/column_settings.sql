CREATE TABLE IF NOT EXISTS `buildings` (`address` varchar(255) UNIQUE NOT NULL COMMENT 'to include unit number', `id` integer PRIMARY KEY UNIQUE DEFAULT 123 COMMENT 'Number');
