class Hero {  
    int durability;
    int offense;
    int ability;
    int difficulty;
    String name;
    String role;
    String speciality;
    String skin;

    Hero(String nama) {
        name = nama;
    }

    String moveLeft() {
        return "kiri";
    }

    String moveRight() {
        return "kanan" ;
    }

    String moveForward() {
        return "maju";
    }

    String moveBackward() {
        return "mundur" ;
    }

    String passive() {  
        return "passive " + this.name;
    }
    
    String skill1() {  
        return "skill 1 " + this.name;
    }
    
    String skill2() {
        return "skill 2 " + this.name;
    }
    
    String ultimate() {
        return "ultimate " + this.name;
    }
}
   