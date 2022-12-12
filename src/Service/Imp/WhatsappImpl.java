package Service.Imp;

import Classes.Profile;
import Classes.Whatsapp;
import Enums.Status;
import Service.WhatsappService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class WhatsappImpl implements WhatsappService {

    private List<Whatsapp> whatsappList = new ArrayList<>();

    public List<Whatsapp> getWhatsappList() {
        return whatsappList;
    }

    public void setWhatsappList(List<Whatsapp> whatsappList) {
        this.whatsappList = whatsappList;
    }

    @Override
    public String installWhatsapp() {
        boolean b = false;
        try {
            System.out.print("ID : ");
            long id = new Scanner(System.in).nextLong();
            System.out.print("Phone number : ");
            String phoneNumber = new Scanner(System.in).nextLine().trim();
            System.out.print("Create a password : ");
            String password = new Scanner(System.in).nextLine();
            System.out.print(" Username : ");
            String username = new Scanner(System.in).nextLine().toLowerCase();
            String images = "Osmon";
            List<String> messages = new Stack<>();
            List<Profile> contacts = new ArrayList<>();
            Whatsapp whatsapp = new Whatsapp(
                    id, username, password, contacts, messages, getWhatsappStatus(), "DEFAULT_IMAGE", phoneNumber);
            b = whatsappList.add(whatsapp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b ? "Passport created successfully." : "Passport creation failed!";
    }

    @Override
    public List<Whatsapp> getAllWhatsappUsers() {
        return whatsappList;
    }

    @Override
    public List<Status> getAllWhatsappStatuses() {
        return List.of(Status.values());
    }

    @Override
    public String changeStatus() throws Exception {
        System.out.print("Enter your username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine().toLowerCase();
        for (Whatsapp w : whatsappList) {
            if (w.getUserName().equals(username) && w.getPassword().equals(password)) {

            }
        }
        return changeStatus();
    }

    @Override
    public Profile getProfile() throws Exception {
        System.out.print("Enter your username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine();
        for (Whatsapp w : whatsappList) {
            if (w.getUserName().equals(username) && w.getPassword().equals(password)) {
                return w;
            }
        }
        return null;
    }

    @Override
    public Status getWhatsappStatus() throws Exception {
        System.out.print("Enter your username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();
        System.out.print("Enter your password : ");
        String password = new Scanner(System.in).nextLine();
        for (Whatsapp w : whatsappList) {
            if (w.getUserName().equals(username) && w.getPassword().equals(password)) {
                return w.getStatus();
            }
        }
        return null;
    }


    @Override
    public String addContact() {
        return null;
    }
}

