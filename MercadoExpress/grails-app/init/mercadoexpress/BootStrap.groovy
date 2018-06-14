package mercadoexpress

import ulsa.mercado.SesionDos

class BootStrap {

    def init = { servletContext ->

    	SesionDos s = new SesionDos()
    	s.llave=1
    	s.save()

    	
    }
    def destroy = {
    }
}
