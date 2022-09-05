package Collections_011;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	private final String name;
	private List<Seat> seats = new ArrayList<>();

	public String getName() {
		return name;
	}

	public Theater(String name, int rows, int seatsPerRow) {
		this.name = name;

		int lastRow = 'A' + (rows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("02d", seatNum));
			}
		}
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestSeat = null;
		for(Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				break;
			}
		}
		if (requestSeat == null) {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
		return requestSeat.reverse();
	}

	public void getSeats() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}
}
