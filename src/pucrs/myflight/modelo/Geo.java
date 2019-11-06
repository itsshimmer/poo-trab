package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;

	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo geo1, Geo geo2) {
		double lat1 = Math.toRadians(geo1.getLatitude());
		double lat2 = Math.toRadians(geo2.getLatitude());
		double lon1 = Math.toRadians(geo1.getLongitude());
		double lon2 = Math.toRadians(geo2.getLongitude());

		double diflat = (lat1-lat2)/2;
		double diflon = (lon1-lon2)/2;

		double d = Math.pow(Math.sin(diflat),2)+
				Math.pow(Math.sin(diflon),2)*
						Math.cos(lat1) * Math.cos(lat2);

		d = 2 * 6371 * Math.asin(Math.sqrt(d));

		return d;
	}
}
