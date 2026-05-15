package com.springbootproject;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HotelController {

	// ===== GENERAL INFO (GET)-----------------------------------------------------------------------------------
	
	
	@GetMapping("/amenities")
	public String amenities() {
		return "🏊 Rooftop Infinity Pool (6 AM - 10 PM) | " + "💆 Spa & Wellness Center | "
				+ "🏋 24x7 Fitness Center | " + "🍽 3 Restaurants & 2 Bars | " + "🚗 Valet Parking | "
				+ "📶 High-Speed WiFi throughout | " + "🧺 Laundry & Dry Cleaning | " + "🛎 24x7 Room Service | "
				+ "💼 Business Center & Conference Halls.";
	}
	

	@GetMapping("/about")
	public String aboutHotel() {
		return "Welcome to The Grand Horizon Hotel — a 5-star luxury hotel located in the heart of Mumbai. "
				+ "Established in 1995, we offer world-class hospitality with 200+ rooms, fine dining, "
				+ "a rooftop pool, spa, and conference facilities. Your comfort is our priority.";
	}

	@GetMapping("/location")
	public String location() {
		return "We are located at: 42, Marine Drive, Mumbai, Maharashtra - 400001, India. "
				+ "Just 10 minutes from Chhatrapati Shivaji Maharaj International Airport. "
				+ "Nearest Metro: Marine Lines Station (2 min walk).";
	}

	@GetMapping("/contact")
	public String contact() {
		return "📞 Phone: +91-22-4567-8900 | " + "📧 Email: reservations@grandhorizon.com | "
				+ "🌐 Website: www.grandhorizon.com | " + "⏰ Front Desk: Open 24x7";
	}

	@GetMapping("/checkin-checkout")
	public String checkInOut() {
		return "✅ Check-in Time: 12:00 PM (Noon) | " + "🚪 Check-out Time: 11:00 AM | "
				+ "Early check-in and late check-out available on request (subject to availability). "
				+ "Extra charges may apply for late check-out beyond 6:00 PM.";
	}

	@GetMapping("/rooms")
	public String rooms() {
		return "🛏 Room Categories Available: \n" + "1. Standard Room     - ₹4,500/night  (1 Queen Bed, City View)\n"
				+ "2. Deluxe Room       - ₹7,000/night  (1 King Bed, Pool View)\n"
				+ "3. Executive Suite   - ₹12,000/night (Living Area + King Bed, Sea View)\n"
				+ "4. Presidential Suite- ₹25,000/night (2 Bedrooms, Private Terrace, Butler Service)\n"
				+ "All rooms include: Free WiFi, AC, 55\" Smart TV, Mini Bar, Daily Housekeeping.";
	}

	
	@GetMapping("/dining")
	public String dining() {
		return "🍽 Dining Options at Grand Horizon:\n"
				+ "1. The Horizon Grill     - Multi-cuisine restaurant | Open: 7AM - 11PM\n"
				+ "2. Spice Garden          - Authentic Indian cuisine | Open: 12PM - 11PM\n"
				+ "3. Sakura                - Japanese & Asian fusion | Open: 7PM - 11PM\n"
				+ "4. The Rooftop Bar       - Cocktails & snacks with sea view | Open: 5PM - 1AM\n"
				+ "5. Cafe Breeze           - Coffee, sandwiches & desserts | Open: 8AM - 10PM";
	}

	@GetMapping("/spa")
	public String spa() {
		return "💆 Serenity Spa & Wellness at Grand Horizon:\n"
				+ "Services: Swedish Massage, Deep Tissue Massage, Ayurvedic Treatments, "
				+ "Facial Therapies, Body Wraps, Aromatherapy.\n" + "⏰ Timings: 8:00 AM - 9:00 PM (All days)\n"
				+ "📍 Location: 2nd Floor, East Wing\n"
				+ "Prior appointment recommended. Hotel guests get 15% discount.";
	}

	@GetMapping("/policies")
	public String policies() {
		return "📋 Hotel Policies:\n" + "• Pets: Not allowed\n" + "• Smoking: Only in designated outdoor areas\n"
				+ "• Visitors: Allowed in lobby only (not in rooms)\n"
				+ "• ID Proof: Government-issued ID mandatory at check-in\n"
				+ "• Cancellation: Free cancellation up to 48 hours before check-in\n"
				+ "• Children below 5 years: Stay free with parents";
	}

	@GetMapping("/offers")
	public String offers() {
		return "🎉 Current Offers & Packages:\n" + "1. Weekend Getaway    - 2 nights + breakfast + spa = ₹18,000\n"
				+ "2. Honeymoon Package  - 3 nights + candlelight dinner + room decor = ₹35,000\n"
				+ "3. Corporate Package  - Room + conference room + lunch = ₹9,500/day\n"
				+ "4. Early Bird Offer   - Book 30 days in advance = Flat 20% off\n"
				+ "5. Loyalty Members    - Every 5th stay FREE!";
	}

	// ===== BOOKINGS (POST)-----------------------------------------------------------------------------------

	@PostMapping("/book-room")
	public String bookRoom() {
		return "🎊 Room Booking Confirmed!\n" + "Your reservation at The Grand Horizon has been successfully placed. "
				+ "A confirmation email will be sent to your registered email address within 10 minutes. "
				+ "Booking ID: GH-2024-78432. Please carry a valid ID proof at check-in.";
	}

	@PostMapping("/book-spa")
	public String bookSpa() {
		return "💆 Spa Appointment Confirmed!\n" + "Your spa session at Serenity Spa has been booked. "
				+ "Please arrive 10 minutes early. " + "Appointment ID: SPA-2024-3821. "
				+ "Cancellation must be done at least 4 hours in advance to avoid charges.";
	}

	@PostMapping("/book-banquet")
	public String bookBanquet() {
		return "🎉 Banquet Hall Booking Confirmed!\n"
				+ "The Grand Ballroom (capacity: 500 guests) has been reserved for your event. "
				+ "Our events team will contact you within 24 hours to discuss catering, "
				+ "decor, and AV requirements. Booking Ref: BNQ-2024-1045.";
	}

	@PostMapping("/feedback")
	public String submitFeedback() {
		return "🙏 Thank You for Your Feedback!\n"
				+ "We truly appreciate you taking the time to share your experience at The Grand Horizon. "
				+ "Your feedback has been recorded and will be reviewed by our quality team. "
				+ "We look forward to welcoming you back soon!";
	}

	@PostMapping("/loyalty-register")
	public String loyaltyRegister() {
		return "⭐ Welcome to Grand Horizon Loyalty Program!\n"
				+ "You have been successfully enrolled in our exclusive loyalty program. "
				+ "You will earn 10 points for every ₹1,000 spent. "
				+ "Redeem points for free nights, spa sessions, and dining. " + "Your Loyalty ID: LYL-2024-GH-5591.";
	}

	// ===== UPDATES (PUT)-----------------------------------------------------------------------------------

	@PutMapping("/update-booking")
	public String updateBooking() {
		return "✏️ Booking Updated Successfully!\n" + "Your reservation details have been modified as requested. "
				+ "Updated confirmation has been sent to your email. "
				+ "If you need further changes, please contact us at least 24 hours before check-in.";
	}

	@PutMapping("/update-contact")
	public String updateContact() {
		return "📝 Contact Details Updated!\n"
				+ "Your profile contact information has been successfully updated in our system. "
				+ "If you did not request this change, please call our front desk immediately at +91-22-4567-8900.";
	}

	// ===== PARTIAL UPDATES (PATCH)-----------------------------------------------------------------------------------

	@PatchMapping("/upgrade-room")
	public String upgradeRoom() {
		return "🌟 Room Upgrade Applied!\n"
				+ "Congratulations! Your room has been upgraded to the next category as per your request "
				+ "and subject to availability. Upgraded room details will be provided at check-in. "
				+ "Complimentary upgrade applied for loyalty members!";
	}

	// ===== CANCELLATIONS (DELETE)-----------------------------------------------------------------------------------

	
	@DeleteMapping("/cancel-spa")
	public String cancelSpa() {
		return "❌ Spa Appointment Cancelled.\n" + "Your spa booking has been cancelled successfully. "
				+ "Since cancellation was made more than 4 hours in advance, no charges apply. "
				+ "Feel free to rebook at your convenience.";
	}

    @DeleteMapping("/cancel-booking")
    public Map<String, String> cancelBooking() {
    	
    	System.out.println();
        return Map.of(
            "Status", "Cancelled",
            "Refund", "Rs.7000 will be refunded within 5-7 business days",
            "Message", "Your reservation has been successfully cancelled.",
            "Note", "We hope to welcome you again at The Grand Horizon."
        );

    }
}
