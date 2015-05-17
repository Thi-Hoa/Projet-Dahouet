package com.thihoa.dahouet.utils;

/**
 *
 * @author T
 */

    public class ControlUtils {

	// Utiliser la fonction de contrôle du mail (test avec une expression régulière //

	public static boolean CtlMail(String email)

	{

		return email.matches("^[a-zA-Z0-9._-]{2,}+@[a-zA-Z0-9._-]{2,}\\.[a-z]{2,4}$");

	}

    static class CtlMail {

        public CtlMail() {
        }
    }


    }
