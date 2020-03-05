package CajeroDB4O;

public class Persona {

	private int numUsuario;
	private String nombrePersona;
	private String apellidoPPersona;
	private String apellidoMPersona;
	private String FechaNacimiento;
	private String Sexo;
	private String Domicilio;
	private String ClaveElector;
	private String CURP;
	private int AnioRegistro;
	private int Estado;
	private int Municipio;
	private int Seccion;
	private int Localidad;
	private int Emision;
	private int Vigencia;
	private int HolaGuapo;
	

	public int getNumTarj() {
		return numUsuario;
	}

	public void setNumTarj(int numUsuario) {
		this.numUsuario = numUsuario;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPPersona() {
		return apellidoPPersona;
	}

	public void setApellidoPPersona(String apellidoPPersona) {
		this.apellidoPPersona = apellidoPPersona;
	}

	public String getApellidoMPersona() {
		return apellidoMPersona;
	}

	public void setApellidoMPersona(String apellidoMPersona) {
		this.apellidoMPersona = apellidoMPersona;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(String FechaNacimiento) {
		this.FechaNacimiento = FechaNacimiento;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public String getClaveElector() {
		return ClaveElector;
	}

	public void setClaveElector(String claveElector) {
		ClaveElector = claveElector;
	}

	public String getCURP() {
		return CURP;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public int getAnioRegistro() {
		return AnioRegistro;
	}

	public void setAnioRegistro(int anioRegistro) {
		AnioRegistro = anioRegistro;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}

	public int getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(int municipio) {
		Municipio = municipio;
	}

	public int getSeccion() {
		return Seccion;
	}

	public void setSeccion(int seccion) {
		Seccion = seccion;
	}

	public int getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(int localidad) {
		Localidad = localidad;
	}

	public int getEmision() {
		return Emision;
	}

	public void setEmision(int emision) {
		Emision = emision;
	}

	public int getVigencia() {
		return Vigencia;
	}

	public void setVigencia(int vigencia) {
		Vigencia = vigencia;
	}
	
	public String toString() {
		return "NOMBRE: " + nombrePersona + " " + apellidoPPersona + " " + apellidoMPersona
				+ ", FECHA DE NACIMEINTO: " + FechaNacimiento + ", SEXO: " + Sexo + ", DOMICILIO: " + Domicilio 
				+", CLAVE DE ELECTOR: " + ClaveElector +", CURP: " + CURP + " AÑO DE REGISTRO: " + AnioRegistro 
				+", ESTADO: " + Estado + ", MUNICIPIO: " + Municipio +", SECCIÒN " + Seccion
				+ ",LOCALIDAD: " + Localidad + ", EMISIÓN: " + Emision + ", VIGENCIA: " + Vigencia + " ";
	}

	public int getHolaGuapo() {
		return HolaGuapo;
	}

	public void setHolaGuapo(int holaGuapo) {
		HolaGuapo = holaGuapo;
	}

}
