package models;

public class TratamentoSolo implements TratamentoSolos {
    private int codTratamento;
    private String aduboUsado;
    private String phAdubo;

    public TratamentoSolo(int codTratamento, String aduboUsado, String phAdubo) {
        this.codTratamento = codTratamento;
        this.aduboUsado = aduboUsado;
        this.phAdubo = phAdubo;
    }

    @Override
    public int getCodTratamento() {
        return codTratamento;
    }

    @Override
    public String getAduboUsado() {
        return aduboUsado;
    }

    @Override
    public String getPhAdubo() {
        return phAdubo;
    }
}

