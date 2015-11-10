package BaseDatos;

import android.provider.BaseColumns;

/**
 * Created by Mauricio on 04/10/2015.
 */
public interface ConstantesBD extends BaseColumns {

    //region [Usuarios]
    String Tabla_Usuarios = "Usuarios";
    String Usuarios_Nombre = "nombre";
    String Usuarios_Password = "password";
    String Usuarios_IdPreferencias = "idPreferencias";
    //endregion

    //region [Preferencias]
    String Tabla_Preferencias = "Preferencias";
    String Preferencias_CantidadLocales = "cantidadLocales";
    String Preferencias_ModoBusqueda = "modoBusqueda";
    String Preferencias_TipoLocal = "tipoLocal";
    //endregion

    //region [Reviews]
    String Tabla_Review = "Review";
    String Review_IdLocal = "idLocal";
    String Review_IdUsuario = "idUsuario";
    String Review_Comentario = "comentario";
    String Review_Valoracion = "valoracion";
    //endregion

    //region [Local]
    String Tabla_Local = "Local";
    String Local_Nombre = "nombre";
    String Local_Descripcion = "descripcion";
    String Local_ValoracionPromedio = "valoracionPromedio";
    String Local_TipoLocal = "tipoLocal";
    //endregion

    //region [Ubicacion]
    String Tabla_Ubicacion = "Ubicacion";
    String Ubicacion_Direccion = "direccion";
    String Ubicacion_Latitud = "latitud";
    String Ubicacion_Longitud = "longitud";
    String Ubicacion_IdLocal = "idLocal";
    //endregion

    //region [ResultadoBusqueda]
    String Tabla_ResultadoBusqueda = "ResultadoBusqueda";
    String ResultadoBusqueda_NombreArticulo = "nombreArticulo";
    //endregion

    //region [LocalesHijos]
    String Tabla_LocalesHijos = "LocalesHijos";
    String LocalesHijos_Padre = "padre";
    String LocalesHijos_Hijo = "hijo";
    //endregion

    //region [Articulos]
    String Tabla_Articulos = "Articulos";
    String Articulos_Nombre = "nombre";
    String Articulos_Precio = "precio";
    String Articulos_IdLocal = "idLocal";
    //endregion

    //region [Historial]
    String Tabla_Historial = "Historial";
    String Historial_Fecha = "fecha";
    String Historial_Direccion = "direccion";
    //endregion

    //region [LocalesHist]
    String Tabla_LocalesHist = "LocalesHist";
    String LocalesHist_Nombre = "nombre";
    //endregion

    //region [HistLocalArticulo]
    String Tabla_HistLocalArticulo = "HistLocalArticulo";
    String HistLocalArticulo_IdHistorial = "idHistorial";
    String HistLocalArticulo_IdLocalHist = "idLocalHist";
    String HistLocalArticulo_IdArticulo = "idArticulo";
    //endregion
}
