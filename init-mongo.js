db.createUser(
	{
		user	: "agazin",
		pwd		: "agazin",
		roles	: [
			{
				role	: "readWrite",
				db	: "ex-mongo"
			}
		]
	}
)