class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            int atPos = emails[i].indexOf("@");
            String name = emails[i].substring(0, atPos);
            String domain = emails[i].substring(atPos);
            if (name.contains("+")) {
                name = name.substring(0, name.indexOf("+"));
            }
            if (name.contains(".")) {
                name = name.replaceAll(".", "");
            }

            result.add(name + domain);
        }

        return result.size();
    }
}