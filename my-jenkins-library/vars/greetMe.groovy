// vars/greetMe.groovy
def call(String name, String date) {
    // Extracts just the day number if a YYYY-MM-DD format is passed
    def day = date.contains('-') ? date.split('-')[-1] : date
    echo "Hi '${name}', today is '${day}'"
}
