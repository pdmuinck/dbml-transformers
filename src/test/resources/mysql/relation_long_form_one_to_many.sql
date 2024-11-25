CREATE TABLE IF NOT EXISTS `posts` (`id` integer PRIMARY KEY, `user_id` integer);
CREATE TABLE IF NOT EXISTS `users` (`id` integer);
ALTER TABLE `users` ADD CONSTRAINT `fk_name` FOREIGN KEY (`id`) REFERENCES `posts` (`user_id`);
