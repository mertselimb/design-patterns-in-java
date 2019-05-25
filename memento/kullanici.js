class kullanici {
    constructor(kullaniciAdi, sifreHash, mail) {
        this.ID = Math.random();
        this.sifreHash = sifreHash;
        this.kullanici = kullaniciAdi;
        this.email = mail;
    }
    sifreGuncelle(str) {
        this.sifreHash = str;
    }
    emailGuncelle(str) {
        this.email = str;
    }
}


export default kullanici;