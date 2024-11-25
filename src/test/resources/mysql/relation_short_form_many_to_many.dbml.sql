CREATE TABLE `posts` (`id` integer PRIMARY KEY, `user_id` integer);
CREATE TABLE `users` (`id` integer);
CREATE TABLE `posts_users` (`posts_user_id` integer, `users_id` integer, PRIMARY KEY (`posts_user_id`, `users_id`));
ALTER TABLE `posts_users` ADD FOREIGN KEY (`posts_user_id`) REFERENCES `posts` (`user_id`);
ALTER TABLE `posts_users` ADD FOREIGN KEY (`users_id`) REFERENCES `users` (`id`);


