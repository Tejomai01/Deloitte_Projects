package com.whatsappboot.service;

import java.util.List;

import com.whatsappboot.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	List<WhatsappUser> viewAllProfileService();

	WhatsappUser viewProfileService(WhatsappUser w);

	int createProfileService(WhatsappUser wu);

	String editProfileService(WhatsappUser ww);

	String deleteProfileService(WhatsappUser w);

}
