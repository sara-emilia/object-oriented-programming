public int compareTo(Paivamaara pvm) {
    
    if (this.vuosi < pvm.annaVuosi()) {
        return -1;
    }
    else if (this.vuosi == pvm.annaVuosi()) {
        if (this.kuukausi < pvm.annaKuukausi()) {
            return -1;
        }
        if (this.kuukausi == pvm.annaKuukausi()) {
            if (this.paiva < pvm.annaPaiva()) {
                return -1;
            }
            if (this.paiva == pvm.annaPaiva()) {
                return 0;
            }
            if (this.paiva > pvm.annaPaiva()) {
                return 1;
            }
        }
        if (this.kuukausi > pvm.annaKuukausi()) {
            return 1;
        }
    }
    else if (this.vuosi > pvm.annaVuosi()) {
        return 1;
    }
    return 0;
}