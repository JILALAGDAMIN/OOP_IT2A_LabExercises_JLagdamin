public class CommunityAidHub {

    //Donor
    static class Donor {
        private int donorId;
        private String name;
        private String contact;

        public Donor(int donorId, String name, String contact) {
            this.donorId = donorId;
            this.name = name;
            this.contact = contact;
        }

        public int getDonorId() { 
            return donorId; 
        }
        public void setDonorId(int donorId) { 
            this.donorId = donorId; 
        }

        public String getName() { 
            return name; 
        }
        public void setName(String name) { 
            this.name = name; 
        }

        public String getContact() { 
            return contact; 
        }
        public void setContact(String contact) { 
            this.contact = contact; 
        }

        public void showDonor() {
            System.out.println("Donor ID : " + donorId);
            System.out.println("Name     : " + name);
            System.out.println("Contact  : " + contact);
        }
    }

    //Donation
    static class Donation {
        private int donationId;
        private String itemType;
        private int quantity;
        private String dateGiven;

        public Donation(int donationId, String itemType, int quantity, String dateGiven) {
            this.donationId = donationId;
            this.itemType = itemType;
            this.quantity = quantity;
            this.dateGiven = dateGiven;
        }

        public int getDonationId() { 
            return donationId; 
        }
        public void setDonationId(int donationId) { 
            this.donationId = donationId; 
        }

        public String getItemType() { 
            return itemType; 
        }
        public void setItemType(String itemType) { 
            this.itemType = itemType; 
        }

        public int getQuantity() { 
            return quantity; 
        }
        public void setQuantity(int quantity) { 
            this.quantity = quantity; 
        }

        public String getDateGiven() { 
            return dateGiven; 
        }
        public void setDateGiven(String dateGiven) { 
            this.dateGiven = dateGiven; 
        }

        public void showDonation() {
            System.out.println("Donation ID : " + donationId);
            System.out.println("Item Type   : " + itemType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Date Given  : " + dateGiven);
        }
    }

    //Beneficiary 
    static class Beneficiary {
        private int beneficiaryId;
        private String name;
        private String need;

        public Beneficiary(int beneficiaryId, String lito, String food) {
            this.beneficiaryId = beneficiaryId;
            this.name = lito;
            this.need = food;
        }

        public int getBeneficiaryId() {
         return beneficiaryId;
         }
        public void setBeneficiaryId(int beneficiaryId) { 
            this.beneficiaryId = beneficiaryId; 
        }

        public String getName() {
             return name; 
        }
        public void setName(String name) { 
            this.name = name; 
        }

        public String getNeed() { 
            return need; 
        }
        public void setNeed(String need) {
             this.need = need; 
        }

        public void showBeneficiary() {
            System.out.println("Beneficiary ID : " + beneficiaryId);
            System.out.println("Name           : " + name);
            System.out.println("Need           : " + need);
        }
    }

    //Main Method
    public static void main(String[] args) {
        Donor donor = new Donor(1, "Ana Reyes", "09171234567");
        Donation donation = new Donation(101, "Rice (10kg)", 5, "2025-09-15");
        Beneficiary beneficiary = new Beneficiary(201, "Lito Santos", "Food Supply");

        donor.showDonor();
        System.out.println();

        donation.showDonation();
        System.out.println();

        beneficiary.showBeneficiary();
    }
}
