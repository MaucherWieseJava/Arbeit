import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;


public class altHash {
    public static void main(String[] args){
        String[] passworts = new String[]{"password1", "password2", "password3",
                "password4", "password5", "password6", "password7", "password8",
                "password9", "password10", "password11", "password12", "password13",
                "password14", "password15", "password16", "password17", "password18",
                "password19", "password20", "password21", "password22", "password23",
                "password24", "password25", "password26", "password27", "password28",
                "password29", "password30", "password31", "password32", "password33",
                "password34", "password35", "password36", "password37", "password38",
                "password39", "password40", "password41", "password42", "password43",
                "password44", "password45", "password46", "password47", "password48",
                "password49", "password50", "password51", "password52", "password53",
                "password54", "password55", "password56", "password57", "password58",
                "password59", "password60", "password61", "password62", "password63",
                "password64", "password65", "password66", "password67", "password68",
                "password69", "password70", "password71", "password72", "password73",
                "password74", "password75", "password76", "password77", "password78",
                "password79", "password80", "password81", "password82", "password83",
                "password84", "password85", "password86", "password87", "password88",
                "password89", "password90", "password91", "password92", "password93",
                "password94", "password95", "password96", "password97", "password98",
                "password99", "password100", "password101", "password102", "password103",
                "password104", "password105", "password106", "password107", "password108",
                "password109", "password110", "password111", "password112", "password113",
                "password114", "password115", "password116", "password117", "password118",
                "password119", "password120", "password121", "password122", "password123",
                "password124", "password125", "password126", "password127", "password128",
                "password129",
                "password130", "password131", "password132", "password133", "password134",
                "password135", "password136", "password137", "password138", "password139",
                "password140", "password141", "password142", "password143", "password144",
                "password145", "password146", "password147", "password148", "password149",
                "password150", "password151", "password152", "password153", "password154",
                "password155", "password156", "password157", "password158", "password159",
                "password160", "password161", "password162", "password163", "password164",
                "password165", "password166", "password167", "password168", "password169",
                "password170", "password171", "password172", "password173", "password174",
                "password175", "password176", "password177", "password178", "password179",
                "password180", "password181", "password182", "password183", "password184",
                "password185", "password186", "password187", "password188", "password189",
                "password190", "password191", "password192", "password193", "password194",
                "password195", "password196", "password197", "password198", "password199",
                "password200"

        };
        hach(passworts);


    }
    public static void hach(String[] passwort){
        Instant start = Instant.now();
        String[] hached = new String[200];
        for(int j = 0; j < passwort.length; j ++){
            hached[j] = hashPassword(passwort[j]);
            System.out.println("Ursprüngliches Passwort: " + passwort[j] + " Gehashtes Passwort: " + hached[j]);



        }
        Instant end = Instant.now();
        System.out.println("Elapsed time: " + java.time.Duration.between(start, end).toMillis() + " millisekunden");






    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
