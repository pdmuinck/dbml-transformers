CREATE TABLE IF NOT EXISTS `users` (`id` integer, `username` varchar(255), `role` varchar(255), `created_at` timestamp);
CREATE TABLE IF NOT EXISTS `posts` (`id` integer, `title` varchar(255), `body` text, `user_id` integer, `created_at` timestamp);
