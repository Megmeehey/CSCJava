package S2_BasicSyntax;

/**
 * Created by megmeehey on 14.07.17.
 */
public class PlayAnalysis {
    private static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder[] textForRoles = new StringBuilder[roles.length];
        for (int j = 0; j < roles.length; j++) {
            roles[j] += ':';
            textForRoles[j] = new StringBuilder();
            textForRoles[j].append('\n');
        }

        int i = 0;
        while (i < textLines.length) {
            int j = 0;
            while (!textLines[i].startsWith(roles[j])) {
                j++;
            }
            textForRoles[j].append((i + 1)).append(") ").append(textLines[i].substring(roles[j].length() + 1)).append('\n');
            i++;
        }

        return makeString(roles, textForRoles);
        // startWith
    }

    private static String makeString(String[] roles, StringBuilder[] textForRoles) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < roles.length) {
            builder.append(roles[i]).append(textForRoles[i].toString());
            i++;
            if (i < roles.length) {
                builder.append('\n');
            }
        }

        return builder.toString();
    }
}
