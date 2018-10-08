typedef struct
{
    int dia;
    int mes;
    int anio;
}eFecha;

typedef struct
{
    int CodigoAlquiler;
    int idJuego;
    int idCliente;
    eFecha date;
    int estado;
}eAlquileres;

void inicializarAlquiler(eAlquileres rent[], int cantidad);
int buscarEspacioLibreAlquiler(eAlquileres rent[], int cantidad);
int buscarAlquilerPorCodigo(eAlquileres rent[], int cantidad, int auxCodAlquiler);

void mostrarUnAlquiler(eAlquileres rent);
void ingresoDatosAlquileres(eAlquileres rent[],int espacioLibre, int auxCodAlquiler, int auxCodCliente, int auxCodJuego, int auxDia, int auxMes, int auxAnio);

void altaAlquiler(eAlquileres rent[], eClientes client[], int cantidad, int cantClientes, int auxCodAlquiler, int auxIdCliente, int auxIdJuego, int auxDia, int auxMes, int auxAnio);

void adminAlquileres(eAlquileres rent[], eClientes client[], int cantidad, int cantClientes);
