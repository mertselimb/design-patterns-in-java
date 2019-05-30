class bakıcı {
    this.mementolar = {};
 
    this.ekle = function(key, memento) {
        this.mementolar[key] = memento;
    },
 
    this.al = function(key) {
        return this.mementolar[key];
    }
}

export default bakıcı;