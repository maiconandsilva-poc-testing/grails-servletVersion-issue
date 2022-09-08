package grails.servletversion.issue

import grails.util.Holders

class BootStrap {

    def init = { servletContext ->
        Holders.grailsApplication.metadata.getServletVersion()
    }
    def destroy = {
    }
}
