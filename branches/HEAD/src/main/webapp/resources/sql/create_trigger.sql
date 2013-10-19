delimiter //
CREATE TRIGGER phpbb_attachments_OnInsert BEFORE INSERT ON `phpbb_attachments`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_attachments_OnUpdate BEFORE UPDATE ON `phpbb_attachments`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_groups_OnInsert BEFORE INSERT ON `phpbb_acl_groups`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_groups_OnUpdate BEFORE UPDATE ON `phpbb_acl_groups`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_options_OnInsert BEFORE INSERT ON `phpbb_acl_options`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_options_OnUpdate BEFORE UPDATE ON `phpbb_acl_options`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_roles_OnInsert BEFORE INSERT ON `phpbb_acl_roles`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_roles_OnUpdate BEFORE UPDATE ON `phpbb_acl_roles`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_roles_data_OnInsert BEFORE INSERT ON `phpbb_acl_roles_data`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_roles_data_OnUpdate BEFORE UPDATE ON `phpbb_acl_roles_data`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_users_OnInsert BEFORE INSERT ON `phpbb_acl_users`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_acl_users_OnUpdate BEFORE UPDATE ON `phpbb_acl_users`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_banlist_OnInsert BEFORE INSERT ON `phpbb_banlist`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_banlist_OnUpdate BEFORE UPDATE ON `phpbb_banlist`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_bbcodes_OnInsert BEFORE INSERT ON `phpbb_bbcodes`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_bbcodes_OnUpdate BEFORE UPDATE ON `phpbb_bbcodes`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_bookmarks_OnInsert BEFORE INSERT ON `phpbb_bookmarks`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_bookmarks_OnUpdate BEFORE UPDATE ON `phpbb_bookmarks`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_bots_OnInsert BEFORE INSERT ON `phpbb_bots`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_bots_OnUpdate BEFORE UPDATE ON `phpbb_bots`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_config_OnInsert BEFORE INSERT ON `phpbb_config`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_config_OnUpdate BEFORE UPDATE ON `phpbb_config`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_confirm_OnInsert BEFORE INSERT ON `phpbb_confirm`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_confirm_OnUpdate BEFORE UPDATE ON `phpbb_confirm`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_disallow_OnInsert BEFORE INSERT ON `phpbb_disallow`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_disallow_OnUpdate BEFORE UPDATE ON `phpbb_disallow`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_drafts_OnInsert BEFORE INSERT ON `phpbb_drafts`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_drafts_OnUpdate BEFORE UPDATE ON `phpbb_drafts`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_extensions_OnInsert BEFORE INSERT ON `phpbb_extensions`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_extensions_OnUpdate BEFORE UPDATE ON `phpbb_extensions`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_extension_groups_OnInsert BEFORE INSERT ON `phpbb_extension_groups`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_extension_groups_OnUpdate BEFORE UPDATE ON `phpbb_extension_groups`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
    
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_forums_OnInsert BEFORE INSERT ON `phpbb_forums`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_forums_OnUpdate BEFORE UPDATE ON `phpbb_forums`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;      

delimiter //
CREATE TRIGGER forumType_OnInsert BEFORE INSERT ON `forumType`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER forumType_OnUpdate BEFORE UPDATE ON `forumType`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;      


delimiter //
CREATE TRIGGER phpbb_forums_access_OnInsert BEFORE INSERT ON `phpbb_forums_access`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_forums_access_OnUpdate BEFORE UPDATE ON `phpbb_forums_access`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER phpbb_forums_track_OnInsert BEFORE INSERT ON `phpbb_forums_track`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_forums_track_OnUpdate BEFORE UPDATE ON `phpbb_forums_track`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER phpbb_forums_watch_OnInsert BEFORE INSERT ON `phpbb_forums_watch`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_forums_watch_OnUpdate BEFORE UPDATE ON `phpbb_forums_watch`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER phpbb_groups_OnInsert BEFORE INSERT ON `phpbb_groups`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_groups_OnUpdate BEFORE UPDATE ON `phpbb_groups`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER phpbb_icons_OnInsert BEFORE INSERT ON `phpbb_icons`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_icons_OnUpdate BEFORE UPDATE ON `phpbb_icons`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_lang_OnInsert BEFORE INSERT ON `phpbb_lang`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_lang_OnUpdate BEFORE UPDATE ON `phpbb_lang`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_log_OnInsert BEFORE INSERT ON `phpbb_log`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_log_OnUpdate BEFORE UPDATE ON `phpbb_log`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_login_attempts_OnInsert BEFORE INSERT ON `phpbb_login_attempts`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_login_attempts_OnUpdate BEFORE UPDATE ON `phpbb_login_attempts`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_moderator_cache_OnInsert BEFORE INSERT ON `phpbb_moderator_cache`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_moderator_cache_OnUpdate BEFORE UPDATE ON `phpbb_moderator_cache`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_modules_OnInsert BEFORE INSERT ON `phpbb_modules`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_modules_OnUpdate BEFORE UPDATE ON `phpbb_modules`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_poll_options_OnInsert BEFORE INSERT ON `phpbb_poll_options`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_poll_options_OnUpdate BEFORE UPDATE ON `phpbb_poll_options`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_poll_votes_OnInsert BEFORE INSERT ON `phpbb_poll_votes`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_poll_votes_OnUpdate BEFORE UPDATE ON `phpbb_poll_votes`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_posts_OnInsert BEFORE INSERT ON `phpbb_posts`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_posts_OnUpdate BEFORE UPDATE ON `phpbb_posts`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_OnInsert BEFORE INSERT ON `phpbb_privmsgs`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_OnUpdate BEFORE UPDATE ON `phpbb_privmsgs`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_folder_OnInsert BEFORE INSERT ON `phpbb_privmsgs_folder`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_folder_OnUpdate BEFORE UPDATE ON `phpbb_privmsgs_folder`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_rules_OnInsert BEFORE INSERT ON `phpbb_privmsgs_rules`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_rules_OnUpdate BEFORE UPDATE ON `phpbb_privmsgs_rules`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_to_OnInsert BEFORE INSERT ON `phpbb_privmsgs_to`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_privmsgs_to_OnUpdate BEFORE UPDATE ON `phpbb_privmsgs_to`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_fields_OnInsert BEFORE INSERT ON `phpbb_profile_fields`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_fields_OnUpdate BEFORE UPDATE ON `phpbb_profile_fields`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_fields_data_OnInsert BEFORE INSERT ON `phpbb_profile_fields_data`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_fields_data_OnUpdate BEFORE UPDATE ON `phpbb_profile_fields_data`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_fields_lang_OnInsert BEFORE INSERT ON `phpbb_profile_fields_lang`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_fields_lang_OnUpdate BEFORE UPDATE ON `phpbb_profile_fields_lang`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_lang_OnInsert BEFORE INSERT ON `phpbb_profile_lang`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_profile_lang_OnUpdate BEFORE UPDATE ON `phpbb_profile_lang`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_ranks_OnInsert BEFORE INSERT ON `phpbb_ranks`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_ranks_OnUpdate BEFORE UPDATE ON `phpbb_ranks`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_reports_OnInsert BEFORE INSERT ON `phpbb_reports`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_reports_OnUpdate BEFORE UPDATE ON `phpbb_reports`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_reports_reasons_OnInsert BEFORE INSERT ON `phpbb_reports_reasons`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_reports_reasons_OnUpdate BEFORE UPDATE ON `phpbb_reports_reasons`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_search_results_OnInsert BEFORE INSERT ON `phpbb_search_results`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_search_results_OnUpdate BEFORE UPDATE ON `phpbb_search_results`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_search_wordlist_OnInsert BEFORE INSERT ON `phpbb_search_wordlist`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_search_wordlist_OnUpdate BEFORE UPDATE ON `phpbb_search_wordlist`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_search_wordmatch_OnInsert BEFORE INSERT ON `phpbb_search_wordmatch`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_search_wordmatch_OnUpdate BEFORE UPDATE ON `phpbb_search_wordmatch`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_sessions_OnInsert BEFORE INSERT ON `phpbb_sessions`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_sessions_OnUpdate BEFORE UPDATE ON `phpbb_sessions`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_sessions_keys_OnInsert BEFORE INSERT ON `phpbb_sessions_keys`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_sessions_keys_OnUpdate BEFORE UPDATE ON `phpbb_sessions_keys`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_sitelist_OnInsert BEFORE INSERT ON `phpbb_sitelist`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_sitelist_OnUpdate BEFORE UPDATE ON `phpbb_sitelist`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_smilies_OnInsert BEFORE INSERT ON `phpbb_smilies`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_smilies_OnUpdate BEFORE UPDATE ON `phpbb_smilies`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_OnInsert BEFORE INSERT ON `phpbb_styles`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_OnUpdate BEFORE UPDATE ON `phpbb_styles`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_template_OnInsert BEFORE INSERT ON `phpbb_styles_template`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_template_OnUpdate BEFORE UPDATE ON `phpbb_styles_template`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_template_data_OnInsert BEFORE INSERT ON `phpbb_styles_template_data`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_template_data_OnUpdate BEFORE UPDATE ON `phpbb_styles_template_data`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_theme_OnInsert BEFORE INSERT ON `phpbb_styles_theme`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_theme_OnUpdate BEFORE UPDATE ON `phpbb_styles_theme`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_imageset_OnInsert BEFORE INSERT ON `phpbb_styles_imageset`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_imageset_OnUpdate BEFORE UPDATE ON `phpbb_styles_imageset`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_imageset_data_OnInsert BEFORE INSERT ON `phpbb_styles_imageset_data`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_styles_imageset_data_OnUpdate BEFORE UPDATE ON `phpbb_styles_imageset_data`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_OnInsert BEFORE INSERT ON `phpbb_topics`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_OnUpdate BEFORE UPDATE ON `phpbb_topics`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_track_OnInsert BEFORE INSERT ON `phpbb_topics_track`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_track_OnUpdate BEFORE UPDATE ON `phpbb_topics_track`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_posted_OnInsert BEFORE INSERT ON `phpbb_topics_posted`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_posted_OnUpdate BEFORE UPDATE ON `phpbb_topics_posted`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_watch_OnInsert BEFORE INSERT ON `phpbb_topics_watch`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_topics_watch_OnUpdate BEFORE UPDATE ON `phpbb_topics_watch`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_user_group_OnInsert BEFORE INSERT ON `phpbb_user_group`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_user_group_OnUpdate BEFORE UPDATE ON `phpbb_user_group`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_users_OnInsert BEFORE INSERT ON `phpbb_users`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_users_OnUpdate BEFORE UPDATE ON `phpbb_users`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_warnings_OnInsert BEFORE INSERT ON `phpbb_warnings`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_warnings_OnUpdate BEFORE UPDATE ON `phpbb_warnings`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_words_OnInsert BEFORE INSERT ON `phpbb_words`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_words_OnUpdate BEFORE UPDATE ON `phpbb_words`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER phpbb_zebra_OnInsert BEFORE INSERT ON `phpbb_zebra`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER aphpbb_zebra_OnUpdate BEFORE UPDATE ON `phpbb_zebra`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER authorities_OnInsert BEFORE INSERT ON `authorities`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER authorities_OnUpdate BEFORE UPDATE ON `authorities`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;