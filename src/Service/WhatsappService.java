package Service;

import Classes.Profile;
import Classes.Whatsapp;
import Enums.Status;

import java.util.List;

public interface WhatsappService {
    String installWhatsapp();

    List<Whatsapp> getAllWhatsappUsers();

    List<Status> getAllWhatsappStatuses();

    String changeStatus() throws Exception;

    Profile getProfile() throws Exception;

    Status getWhatsappStatus() throws Exception;

    String addContact();
}