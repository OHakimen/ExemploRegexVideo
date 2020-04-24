
import java.awt.AWTException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) throws AWTException {
        Pattern p = Pattern.compile("((?![^0-9]{12,}|[^A-z]{12,})([A-z0-9]{4,5}-?[A-z0-9]{4,5}-?[A-z0-9]{4,5}(-?[A-z0-9]{4,5}(-?[A-z0-9]{4,5})?)?))");
        String[] regex = {"Party Hard: FAXPF-FJ5VJ-GNC45\n",
            "American Truck Simulator: PC5DE-I9X3I-DH2DF\n",
            "Middle-earth: Shadow of Mordor GOTY: RKPDV-EDJ5J-4G7LZ\n",
            "Orwell: Keeping an Eye on You: MB046-XQKCB-N80V2\n",
            "Last Day of June: ABBCH-4T8HE-MF63Z\n",
            "Dream Daddy: A Dad Dating Simulator: R963E-IMCVJ-P8XY2\n",
            "Batman Arkham Origins: VGZBH-QC433-KYQ4D\n",
            "SPACECOM: Z2CNB-HFAA2-HEBV9\n",
            "The Mooseman: ZENG8-VF53N-HLDVM\n",
            "Soulblight: E5CTR-QRQKD-X97CM\n",
            "DISTRAINT: Deluxe Edition: EZR40-BNZRH-4HLGA"};
        /*
            FAXPF-FJ5VJ-GNC45 FAXPF-FJ5VJ-GNC45
            PC5DE-I9X3I-DH2DF  PC5DE-I9X3I-DH2DF
RKPDV-EDJ5J-4G7LZ
MB046-XQKCB-N80V2
ABBCH-4T8HE-MF63Z
R963E-IMCVJ-P8XY2
VGZBH-QC433-KYQ4D
Z2CNB-HFAA2-HEBV9
ZENG8-VF53N-HLDVM
E5CTR-QRQKD-X97CM
EZR40-BNZRH-4HLGA
         */
        String allkeys = "";
        for (int i = 0; i < regex.length; i++) {
            Matcher m = p.matcher(regex[i]);

            if (m.find()) {
                String result = m.toMatchResult().toString();
                result = result.substring(result.length() - 18, result.length() - 1);

                allkeys += result + "\n";

            }

        }
        System.out.println(allkeys);
    }
}
