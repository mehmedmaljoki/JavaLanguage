package OOP_08.DataProtection_DataHidding_Encapsulation.AcessControl;

/**
 * 				| Class| package| SubC(same pkg) | SubC (diff pkg)  | world (diff pkg & not subClass
 * --------------------|------- |--------------- |------------------|------
 * public		|   +  |  +     |       +        |      +           |   +
 * -----------------   |------- |--------------- |----------------  |--------
 * protected	|   +  |   +    |       +        |      +           |
 * --------------------|--------|----------------|------------------|-----
 * no modifier	|   +  |   +    |     +          |                  |
 * --------------------|--------|----------------|------------------|-----
 * private		|  +   |
 *
 * Rulles:
 * 		private -> sensative Data
 * 		no modifier -> no using outside the package -> Students package only
 *
 */
public class Main {
	public static void main(String[] args) {
		A obj = new A(34, "Mehmed");

	}
}
